package basic;

/**
 *
 * 来源 http://blog.csdn.net/morewindows/article/details/6684558
 *
 * @Author ewnit
 * @Date 16/10/23.
 */
public class Quick_Sort {
    void quick_sort(int s[], int l, int r) {
        if (l < r) {
            int i = l, j = r, x = s[l];
            while (i < j) {
                while (i < j && s[j] >= x)
                    j--;
                if (i < j)
                    s[i++] = s[j];

                while (i < j && s[i] < x)
                    i++;
                if (i < j)
                    s[j--] = s[i];
            }
            s[i] = x;
            quick_sort(s, l, i - 1);
            quick_sort(s, i + 1, r);
        }
    }
}
