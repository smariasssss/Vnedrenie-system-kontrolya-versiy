# Описание работы SalesManager

## Работа сервиса
* На вход поступает интовый массив из любой последовательности чисел.
* Далее срабатывает цикл _foreach_ между новой переменной _sale_ и массивом чисел, в результате которого переменной _sale_ присваиваются значения массива для следующих действий.
* На следующем шаге с помощью условного оператора _if_ сравниваются переменные _sale_ и _max_ для нахождения максимального значения.

```java
public class SalesManager {
    protected int[] sales;

    public SalesManager(int[] sales) {
        this.sales = sales;
    }

    public int max() {
        int max = -1;
        for (int sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }
}
```

