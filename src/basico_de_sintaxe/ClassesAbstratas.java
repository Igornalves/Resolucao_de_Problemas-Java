package basico_de_sintaxe;

public abstract class ClassesAbstratas {

    /*classes abstratas não podem ser instanciadas dessa forma
    vc não pode usa a palavra reservada NEW para instanciar um objeto 
    dentro de uma classe abstrata
    */
    
    public abstract void fazerBarulho();

    /* já nesse caso, outra class tera que herdar o metodo fazerBarulho 
     * de forma que em outra class ela tera que ser sobreescrita para que funcione 
     * corretamente
     */

}
