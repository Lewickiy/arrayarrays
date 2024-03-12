package org.lewickiy;

public class Benchmark {

    long startTime;
    long endTime;
    String[][] st;

    public Benchmark(int arrayX, int arrayY) {
        st = new String[arrayX][arrayY];
        init();
    }

    private void init() {
        for (int i = 0; i < st.length; i++) {
            for (int i1 = 0; i1 < st.length; i1++) {
                String s = "a";
                st[i1][i] = s + "a";
            }
        }
    }

    private Long getTimeInMs() {
        return (endTime - startTime) / 1000000;
    }

    private void start() {
        startTime = System.nanoTime();
    }

    private void end() {
        endTime = System.nanoTime();
    }

    public Long getTimeByRow() {
        start();
        for (int i = 0; i < st.length; i++) {
            for (int i1 = 0; i1 < st.length; i1++) {
                String s = st[i][i1];
            }
        }
        end();
        return getTimeInMs();
    }

    public Long getTimeByColumn() {
        start();
        for (int i = 0; i < st.length; i++) {
            for (int i1 = 0; i1 < st.length; i1++) {
                String s = st[i1][i];
            }
        }
        end();
        return getTimeInMs();
    }
}
