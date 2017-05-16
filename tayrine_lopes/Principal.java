/*
 * PROFESSORA: Alice Faleiro
 * CURSO: Gestão da Tecnologia da Informação
 * ALUNO: Tayrine Lopes Guimarães
 */
package prjcilindro;
/**
 * @author: Tayrine Lopes // tayrinelguimaraes@gmail.com
 * @project: Principal 
 * @package: prjcilindro
 * @date: 14/03/2017
 */
public class Principal {


    public static void main(String[] args) {
        Cilindro x = new Cilindro();
        x.setRaio(3.0);
        x.setAltura(5.0);
        System.out.println(x.toString());
        
        Cilindro y = new Cilindro();
        y.setAltura(4.7);
        y.setRaio(3.3);
        System.out.println(y.toString());
    }

}