package iterator;

public class MyCollection {
    String strArr[] = {"ads","qqq","www","eee","rrr"};
    public String get(int i){
        return this.strArr[i];
    }
    public Iterator iterator(){
        return new Iterator();

    }



    class Iterator{
        private MyCollection collection;
        private int position=0;
        protected  Iterator(){}
        protected  Iterator(MyCollection collection){
            this.collection=collection;
        }
        public boolean hasNext(){
            if(position< MyCollection.this.strArr.length-1&&position >=0){
                return  true;
            }
            return  false;
        }

        public String next(){
            if(position<=MyCollection.this.strArr.length-1)
                position++;
            return MyCollection.this.strArr[position];
        }

        public String previous(){
            if(position>0)
                position--;
            return  MyCollection.this.strArr[position];
        }

    }
}
