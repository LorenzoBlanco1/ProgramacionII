
package com.mycompany.tp5;


public class TP5 {

    public static void main(String[] args) {
        
        //Ejercicio1.
        System.out.println("Ejercicio 1: ");
        Pasaporte pasaporte = new Pasaporte(1, "19 de noviembre", 
                "Foto de perfil", "primer plano");
        Titular titular = new Titular("Lorenzo", 45347019); 
        pasaporte.setTitular(titular);
        System.out.println(pasaporte);
        pasaporte.setTitular(null); 
        System.out.println(pasaporte);
        System.out.println("Titular existe: " + titular);
        
        //Ejercicio2.
        System.out.println("Ejercicio 2: ");
         Usuario usuario = new Usuario("Lorenzo", 453437019);
        Bateria bateria = new Bateria("bat12", 2815);
        Celular celular = new Celular("imei1", "iphone", "12", bateria);
        System.out.println(celular);
        celular.setUsuario(usuario);
        System.out.println(celular.getUsuario());
        System.out.println("El usuario asociado al celular es: " + usuario.getCelular());
        System.out.println("El celular asociado al usuario es: " + celular.getUsuario());
        
        //Ejercicio 3.
        System.out.println("Ejercicio 3: ");
        Editorial editorial = new Editorial("Lorenzo", "Centro"); 
        Libro libro = new Libro("El libro", "ISBN1", editorial); 
        Autor autor = new Autor("Lorenzo Blanco", "Argentino");
        libro.setAutor(autor); 
        System.out.println(libro);
        System.out.println(libro.getAutor());
        
        //Ejercicio4.
        System.out.println("Ejercicio 4: ");
        Banco banco = new Banco("Cordoba", "23-45347019-9");
        Cliente cliente = new Cliente("Lorenzo", 45347019);
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(1234, "1 enero 2025", banco);
        System.out.println(tarjeta);
        tarjeta.setCliente(cliente); 
        System.out.println("El cliente de la tarjeta es: " + tarjeta.getCliente());
        System.out.println("La tarjeta del cliente es:  " + 
                cliente.getTarjetaDeCredito());
        
        // Ejercicio 5. 
        System.out.println("Ejercicio 5: ");
        Computadora computadora = new Computadora("HP", 1, "Asus Rog", "B560");
        Propietario propietario = new Propietario("Lorenzo", 45347019); 
        computadora.setPropietario(propietario);
        System.out.println(computadora);
        computadora.setPropietario(null); 
        System.out.println(computadora);
        System.out.println(propietario);
        
        // Ejercicio 6.
        System.out.println("Ejercicio 6: ");
        Cliente2 cliente2 = new Cliente2("Lorenzo", 351761399);
        Mesa mesa = new Mesa(5, 2);
        Reserva reserva = new Reserva("1 noviembre", "22 hs", mesa);
        System.out.println(reserva);
        System.out.println(reserva.getMesa());
        reserva.setCliente2(cliente2);
        System.out.println(reserva.getCliente2());
        
        // Ejercicio 7.
        System.out.println("Ejercicio 7:");
        Motor motor = new Motor("Diesel", 1);
        Conductor conductor = new Conductor("Lorenzo", "Tipo A");
        Vehiculo vehiculo = new Vehiculo("AE429KG", "Virtus", motor);
        System.out.println(vehiculo);
        System.out.println(vehiculo.getMotor());
        System.out.println(conductor);
        System.out.println(vehiculo.getConductor());
        vehiculo.setConductor(conductor); 
        System.out.println(vehiculo.getConductor());
        
        // Ejercicio 8.
        System.out.println("Ejercicio 8: ");
        Usuario1 usuario1 = new Usuario1("Lorenzo", "Blancolorenzo139@gmail.com");
        Documento documento = new Documento("DOC1", "IVA Digal", "cod1", 
                "1 noviembre", usuario1);
        System.out.println(documento.getFirmaDigital().getUsuario1());
        System.out.println(documento.getFirmaDigital());
        System.out.println(documento);
        
        // Ejercicio 9.
        System.out.println("Ejercicio 9: ");
        Paciente paciente = new Paciente("Javier", "Osde");
        Profesional profesional = new Profesional("Lorenzo", "Cardiología");
        CitaMedica citaMedica = new CitaMedica("2 noviembre", "10:00 hs");
        
        citaMedica.setPaciente(paciente); 
        citaMedica.setProfesional(profesional);
        System.out.println(citaMedica);
        System.out.println(citaMedica.getPaciente());
        System.out.println(citaMedica.getProfesional());
        
        
        // Ejercicio 10.
        System.out.println("Ejercicio 10: ");
        CuentaBancaria cuentaBancaria = new CuentaBancaria("0001", 10.0, "cod1",
                "1 noviembre");
        Titular1 titular1 = new Titular1("Lorenzo", 45347019);
        cuentaBancaria.setTitular1(titular1); 
        titular1.setCuentaBancaria(cuentaBancaria); 
        System.out.println(cuentaBancaria.getTitular1());
        System.out.println(cuentaBancaria.getClaveSeguridad()); 
        System.out.println(titular1.getCuentaBancaria());
        
        
        // Ejercicio 11. 
        System.out.println("Ejercicio 11: ");
        Artista artista = new Artista("Eric Clapton", "Rock Clasico"); 
        Cancion cancion = new Cancion("Layla", artista);
        Reproductor rep = new Reproductor();
        rep.reproducir(cancion); 
        
        // Ejercicio 12.
        System.out.println("Ejercicio 12: ");
        Contribuyente contribuyente = new Contribuyente("Lorenzo", "23-45347019-9");
        Impuesto impuesto = new Impuesto(2000.00, contribuyente);
        Calculadora calc = new Calculadora(); 
        calc.calcular(impuesto);
        
        // Ejercicio 13. 
        System.out.println("Ejercicio 13: ");
        Usuario3 usuario3 = new Usuario3("Lorenzo", "Lolo@gmail.com");
        CodigoQR codigoQR = new CodigoQR("valor1", usuario3); 
        GeneradorQR gen = new GeneradorQR();
        gen.generar("valor1", usuario3); 
        
        // Ejercicio 14.
        System.out.println("Ejercicio 14: ");
        Proyecto proyecto = new Proyecto("proyecto 1", 3);
        Render render = new Render("PNG", proyecto); 
        EditorVideo editorvid = new EditorVideo(); 
        editorvid.exportar("PNG", proyecto);
        
        
    }
}
