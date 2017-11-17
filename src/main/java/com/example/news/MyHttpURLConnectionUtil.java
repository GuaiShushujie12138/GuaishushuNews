package com.example.news;

import android.util.Log;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * Created by 付旺辉 on 2017/3/14.
 */

public class MyHttpURLConnectionUtil {
    public static void sendRequest(final String url, final List<BasicValue<String, String>> param, final ResponseListener listener) {

                try {
                    URL u = new URL(url);
                    HttpURLConnection connection = (HttpURLConnection) u.openConnection();
                    if (param == null) {
                        /**
                         * get
                         */
                        connection.setRequestMethod("GET");
                        connection.setReadTimeout(8000);
                        connection.setConnectTimeout(8000);
                        connection.connect();
                    } else {
                        /**
                         * post
                         */
                        connection.setRequestMethod("POST");
                        connection.setReadTimeout(9000);
                        connection.setConnectTimeout(9000);
                        connection.setDoInput(true);
                        connection.setDoOutput(true);
                        connection.connect();
                        PrintWriter printWriter = new PrintWriter(connection.getOutputStream());
                        for (int i = 0; i < param.size(); i++) {
                            BasicValue<String, String> value = param.get(i);
                            if (i != 0) {
                                printWriter.write("&");
                            }
                            printWriter.write(value.getKey() + "=" + value.getValue());
                        }
                        printWriter.flush();
                        printWriter.close();
                    }
                    StringBuffer stringBuffer = new StringBuffer();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                    String line = "";
                    while ((line = bufferedReader.readLine()) != null) {
                        stringBuffer.append(line);
                    }
                    Log.i("MyHttpURLConnectionUtil","bean:" + stringBuffer.toString());
                    bufferedReader.close();
                    if (listener != null) {
                        listener.onResult(stringBuffer.toString());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    if (listener != null) {
                        listener.onError(e.getMessage());
                    }
                }
            }

        //return listener.onResult(stringBuffer.toString());
    }



