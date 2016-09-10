/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author liborio
 */
public class clase {

    private int Numerador;
    private int Denominador;
    private int Numero_Entero;

    public clase(int Numerador, int Denominador, int Numero_Entero) throws DenominadorCeroException {
        this.Denominador = Denominador;
        this.Numerador = Numerador;
        this.Numero_Entero = Numero_Entero;
        if (Denominador == 0) {
            throw new DenominadorCeroException();
        }
    }

    public int getNumerador() {
        return Numerador;
    }

    public void setNumerador(int Numerador) {
        this.Numerador = Numerador;
    }

    public int getDenominador() {
        return Denominador;
    }

    public void setDenominador(int Denominador) {
        this.Denominador = Denominador;
    }

    public int getNumero_Entero() {
        return Numero_Entero;
    }

    public void setNumero_Entero(int Numero_Entero) {
        this.Numero_Entero = Numero_Entero;
    }

    public clase Suma(clase f2) throws DenominadorCeroException {
        int Mixto1, Mixto2, Sum, Nume, Deno, Ente, MDenoUno, MDenoDos, SumDeno;
        clase f;

        Mixto1 = this.Numero_Entero * this.Denominador + this.Numerador;
        MDenoUno = this.Denominador;
        Mixto2 = f2.Numero_Entero * f2.Denominador + f2.Numerador;
        MDenoDos = f2.Denominador;
        Sum = Mixto1 * MDenoDos + MDenoUno * Mixto2;
        SumDeno = MDenoUno * MDenoDos;
        Deno = SumDeno;
        Ente = Sum / SumDeno;
        Nume = Sum % Ente;

        f = new clase(Nume, Deno, Ente);
        return f;
    }

    public clase Resta(clase f2) throws DenominadorCeroException {
        int Mixto1, Mixto2, Rest, Nume, Deno, Ente, MDenoUno, MDenoDos, RestDeno;
        clase f;
        Mixto1 = this.Numero_Entero * this.Denominador + this.Numerador;
        MDenoUno = this.Denominador;
        Mixto2 = f2.Numero_Entero * f2.Denominador + f2.Numerador;
        MDenoDos = f2.Denominador;
        Rest = Mixto1 * MDenoDos - MDenoUno * Mixto2;
        RestDeno = MDenoUno * MDenoDos;
        Deno = RestDeno;
        Ente = Rest / RestDeno;
        Nume = Rest % Ente;

        f = new clase(Nume, Deno, Ente);
        return f;
    }

    public clase Multiplicacion(clase f2) throws DenominadorCeroException {
        int Mixto1, Mixto2, Mult, Nume, Deno, Ente, MDenoUno, MDenoDos, MultDeno;
        clase f;

        Mixto1 = this.Numero_Entero * this.Denominador + this.Numerador;
        MDenoUno = this.Denominador;
        Mixto2 = f2.Numero_Entero * f2.Denominador + f2.Numerador;
        MDenoDos = f2.Denominador;
        Mult = Mixto1 * Mixto2;
        MultDeno = MDenoUno * MDenoDos;
        Deno = MultDeno;
        Ente = Mult / MultDeno;
        Nume = Mult % Ente;

        f = new clase(Nume, Deno, Ente);
        return f;
    }

    public clase Division(clase f2) throws DenominadorCeroException {
        int Mixto1, Mixto2, Div, Nume, Deno, Ente, MDenoUno, MDenoDos, DivDeno;
        clase f;

        Mixto1 = this.Numero_Entero * this.Denominador + this.Numerador;
        MDenoUno = this.Denominador;
        Mixto2 = f2.Numero_Entero * f2.Denominador + f2.Numerador;
        MDenoDos = f2.Denominador;
        Div = Mixto1 * MDenoDos;
        DivDeno = MDenoUno * Mixto2;
        Deno = DivDeno;
        Ente = Div / DivDeno;
        Nume = Div % Ente;

        f = new clase(Nume, Deno, Ente);
        return f;

    }

}
