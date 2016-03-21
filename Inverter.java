/**
 * Created by Давид on 20.03.2016.
 */
public class Inverter {

    public static void inverter(int[] arr) {
        int tmp, lenght = arr.length;
        for (int i = 0; i < lenght / 2; ++i) {
            tmp = arr[i];
            arr[i] = arr[lenght - i - 1];
            arr[lenght - i - 1] = tmp;
        }
    }
}
