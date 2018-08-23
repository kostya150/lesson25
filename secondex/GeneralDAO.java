package lesson25.secondex;

public class GeneralDAO  <T> {
    private T[] array = (T[])new Object[10];

    public T save(T t) throws Exception {
        int index = 0;
        for(T el: array){
            if(el == null){
                array[index] = t;
                return array[index];

            }
            index++;
        }
        throw new Exception("Can't save the object");

    }

    public T[] getAll() {
        return array;
    }

}
