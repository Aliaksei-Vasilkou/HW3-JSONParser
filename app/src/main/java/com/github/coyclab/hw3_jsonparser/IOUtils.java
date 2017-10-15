package com.github.coyclab.hw3_jsonparser;

import android.util.Log;

import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOUtils {
    public static String toString(final InputStream inputStream) throws IOException {
        InputStreamReader inputStreamReader = null;
        BufferedReader reader = null;
        final StringBuilder sb = new StringBuilder();
        String line;
        try {
            inputStreamReader = new InputStreamReader(inputStream);
            reader = new BufferedReader(inputStreamReader);
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
        } finally {
            close(inputStream);
            close(inputStreamReader);
            close(reader);
        }
        return sb.toString();
    }

    private static void close(final Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (final IOException e) {
                //can be ignored
                Log.e("IOUtils", e.getMessage());
            }
        }
    }
}
