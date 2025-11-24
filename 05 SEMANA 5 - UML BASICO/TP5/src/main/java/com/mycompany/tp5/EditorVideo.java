
package com.mycompany.tp5;
public class EditorVideo {
    public Render exportar(String formato, Proyecto proyecto) {
        System.out.println("Exportando: " + proyecto.toString());
        // El objeto Render es creado aquí.
        Render renderFinal = new Render(formato, proyecto);
        System.out.println("Render listo");
        return renderFinal;
    }
}

