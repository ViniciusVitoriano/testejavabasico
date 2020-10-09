package br.com.confidencecambio.javabasico.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.lang.String;


/*Provavelmente não vou utilizar, parece desnecessário para minha função original.
    Meu objetivo aqui, era fazer com que os IMC's ficassem salvos em um array, que fosse ser consultado com
    o comando GET, porém, depois de pensar melhor, vi que poderia ter problemas com nomes iguais, uma solução seria
    fazer com que o array tivesse também outro dado. a variavel ID, que seria igual a o length + 1. Porém pareceu ser
    muita coisa para algo basico como uma consulta de IMC.
    Pensei em deletar essa classe, mas talvez seja melhor deixar ela aqui como parte de como eu penso.


    Não é trabalho demais, é o trabalho exato necessário.


 */
@Service
public class IMCForm {
    @Autowired


    private static float imc;
    private static String name;
    private static String nameUpperCase;
    private static String nameAbbreviated;
    private static String nameLast;
    private static String nameFirst;
    private static float height;
    private static float weight;




    public IMCForm(String name, float height, float weight, float imc, String nameUpperCase,
                   String nameAbbreviated, String nameSur, String nameFirst, String nameLast, String middleName) {
        super();
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.imc = imc;
        this.nameUpperCase = nameUpperCase;
        this.nameAbbreviated = nameAbbreviated;
        this.nameFirst = nameFirst;
        this.nameLast = nameLast;
        this.middleName = middleName;

    }

    public static String[] nameArray = name.split(" ");
    public static String middleName = nameArray[1];
    private static String nameSur = nameArray[nameArray.length-1];

    public static float getIMC() {
        return (imc = (weight/ (height * height))/100);

    }

    public static String getUppercase(){
        return (nameUpperCase = name.toUpperCase());
    }
    public void setUppercase(){
        this.nameUpperCase = nameUpperCase;
    }

    public static String getNameFirst() {
        return (nameFirst = nameArray[0]);
    }
    public void setNameFirst(){
        this.nameFirst = nameFirst;
    }
    public static String getNameLast() {
        return (nameLast = nameArray[1] +" "+nameArray[2]);
    }

    public void setNameLast() {
        this.nameLast = nameLast;
    }
    public static String getNameSur(){
        return(nameSur);
    }
    public void setNameSur(){
        this.nameSur=nameSur;
    }
    public static String getMiddleName(){
        return(nameArray[1]);
        //usar Array.copyof caso dê tempo.

    }
    public void setMiddleName(){
        this.middleName = middleName;
    }


    public static String getNameAbbreviated(){
        nameSur = nameArray[nameArray.length-1];
        return(nameAbbreviated = (nameArray[0]+ middleName.charAt(0)+ "." + nameSur));
    }
    public void setNameAbbreviated(){
        this.nameAbbreviated = getNameAbbreviated();
    }

    public String getName() {
        switch(name) {
            case "":
            case " ":
                name = "Incognito";
                break;
        }
            return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHeight() {
        return height;
    }

    public float getWeight() {
        return weight;
    }

    public float getImc() {
        imc = weight / (height * height);
        return imc;
    }

    public void setImc(float imc) {
        this.imc = imc;
    }



}

