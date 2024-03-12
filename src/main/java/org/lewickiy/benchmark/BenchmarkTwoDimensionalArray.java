package org.lewickiy.benchmark;

public class BenchmarkTwoDimensionalArray extends Benchmark {

    String[][] st;

    public BenchmarkTwoDimensionalArray(int arrayX, int arrayY) {
        int x = arrayX <= 0 ? 1 : arrayX;
        int y = arrayY <= 0 ? 1 : arrayY;
        st = new String[x][y];
        init();
    }

    public void init() {
        for (int i = 0; i < st.length; i++) {
            for (int i1 = 0; i1 < st.length; i1++) {
                String s = "a";
                st[i1][i] = s + "a";
            }
        }
    }

    public Long getTimeByRow() {
        start();
        for (String[] column : st) {
            for (int row = 0; row < st.length; row++) {
                var string = column[row];
            }
        }
        end();
        return getTimeInMs();
    }

    public Long getTimeByColumn() {
        start();
        for (int row = 0; row < st.length; row++) {
            for (String[] column : st) {
                var string = column[row];
            }
        }
        end();
        return getTimeInMs();
    }
}
