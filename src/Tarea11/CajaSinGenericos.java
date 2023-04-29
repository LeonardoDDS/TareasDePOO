package Tarea11;

import java.util.Arrays;

public class CajaSinGenericos {
    Object[] content;

    public CajaSinGenericos() {
    }

    public CajaSinGenericos(Object[] cotent) {
        this.content = cotent;
    }
    public void add(int pos, Object objeto){
        content[pos] = objeto;
    }
    public Object get(int pos){
        return content[pos];
    }

    @Override
    public String toString() {
        return "CajaSinGenericos{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
}
