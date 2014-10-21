package weivretni.careercup;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Question2_2_Test {

    private Question2_2 source = new Question2_2();

    class Key {

        private int key;

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + getOuterType().hashCode();
            result = prime * result + key;
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Key other = (Key) obj;
            if (!getOuterType().equals(other.getOuterType()))
                return false;
            if (key != other.key)
                return false;
            return true;
        }

        private Question2_2_Test getOuterType() {
            return Question2_2_Test.this;
        }

    }

    @Test
    public void testeQuestion() {
        Key key1 = new Key();
        key1.setKey(1);
        
        
        Map m = new HashMap();
        m.put(key1, "1");
        
        key1.setKey(2);
        
        Key key2 = new Key();
        key2.setKey(2);
        System.out.println(m.containsKey(key2));
    }
}
