public class DynamicArray<T> {
    private void throwException() {
        throw new ArithmeticException("Слышь тебе сюда нельзя");
} public int size(){
        int number = 0;
        for(int i = 0; i < capacity(); i++){
            if(array[i] != null){
                number = i;
            }}
        return number + 1;
    }
        private final int DEFAULT_SIZE = 10;
        private T[] array;

        public DynamicArray(){

            array = (T[])new Object[DEFAULT_SIZE];
        }

        public T get(int index){
            if(size() < index | index < 0){throwException();}
            return array[index];
        }

        public void set(int index,T value){
            if(size() < index | index < 0){throwException();}
            array[index] = value;
        }
        public void resize(int newSize){
            if (newSize < 0){throwException();}
            T[] newArray = array.clone();
            array = (T[])new Object[newSize];
            for(int i = 0; i < newSize; i++){
                array[i] = newArray[i];
            }
        }
    public int capacity(){
        return array.length;
    }
    public int FindFirst(T value){
            for(int i=0;i<capacity();i++){
                if(array[i] == value){
                    return i;
                }
            }
             return -1;
    }
    public int FindLast(T value){
        for(int i= capacity();i>-1;i--){
            if(array[i] == value){
                return i;
            }
        }
        return -1;
    }
    public void add(T value){
        if (size() >= capacity()) {
            resize((capacity() * 2) + 1);
        }
        set(size(), value);
    }
}


