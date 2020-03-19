

/**
 * Escreva a descrição da classe Carro aqui.
 * 
 * @author (seu nome) 
 * @version (número de versão ou data)
 */
public class Carro
{
    // variáveis de instância - substitua o exemplo abaixo pelo seu próprio
    private int x;
    private Motor motor; 
    
    /**
     * COnstrutor para objetos da classe Carro
     */
    public Carro (Motor motor)
    {
        // inicializa variáveis de instância
        // colocar new na frente do motor depois do igual 
        this.motor = motor ; 
        
        x = 0;
    }

    /**
     * Exemplo de método - substitua este comentário pelo seu próprio
     * 
     * @param  y   exemplo de um parâmetro de método
     * @return     a soma de x com y 
     */
    public int sampleMethod(int y)
    {
        // ponha seu código aqui
        return x + y;
    }

public Motor getMotor(){
        
        return this.motor; 
    
    }


}
