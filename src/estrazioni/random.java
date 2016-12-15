package estrazioni;

//@author Denis Valente
public class random {

    int[] x = new int[10];

    public void genera() {
        for (int i = 0; i < x.length; i++) {
            x[i] = (int) (Math.random() * 100) + 1;
        }
    }

    public int getElement(int index) {
        if (index < 0 || index >= x.length) {
            return 0;
        }
        return x[index];
    }

    @Override
    public String toString() {
        String s = "Elementi [" + x.length + "]: ";
        for (int i = 0; i < x.length; i++) {
            s += x[i] + " ";
        }
        return s;
    }

    public int trovaMax() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < x.length; i++) {
            if (x[i] > max) {
                max = x[i];
            }
        }
        return max;
    }

    public int trovaMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < x.length; i++) {
            if (min > x[i]) {
                min = x[i];
            }
        }
        return min;
    }

    public int trovaMedia() {
        int media = 0;
        for (int i = 0; i < x.length; i++) {
            media = media + x[i];
        }
        media = media / x.length;
        return media;
    }

    public void percentuale() {
        int p = 0, d = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] % 2 == 0) {
                p++;
            } else {
                d++;
            }
        }
        System.out.println("La percentuale dei numeri pari è: " + p * 100 / x.length);
        System.out.println("La percentuale dei numeri dispari è: " + d * 100 / x.length);
    }

    public void bubbleSort() {
        for (int i = 0; i < x.length; i++) {
            boolean flag = false;
            for (int j = 0; j < x.length - 1; j++) {
                if (x[j] > x[j + 1]) {
                    int k = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = k;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
    }

}
