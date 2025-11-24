
package com.mycompany.tp5;
public class Render {
    private String formato;
    private Proyecto proyecto;

    public Render(String formato, Proyecto proyecto) {
        this.formato = formato;
        this.proyecto = proyecto;
    }

    @Override
    public String toString() {
        return "Render [formato=" + formato + ", proyecto=" + proyecto + "]";
    }
}