public class MyArrayDataException extends Exception{
    public MyArrayDataException(int row, int column) {
        super("В ячейке [" + row + "][" + column + "] лежат неверные данные");
    }
}
