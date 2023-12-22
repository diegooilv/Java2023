/* 
Neste exemplo, a classe Carro possui um atributo marca privado, com métodos getMarca e setMarca para acessá-lo e modificá-lo. Isso garante a encapsulação e o acesso controlado aos dados do objeto.

[Conclusão]:

Getters e setters desempenham um papel fundamental em OOP, permitindo o acesso controlado aos atributos de objetos.
Eles são uma prática comum para garantir o encapsulamento e a integridade dos dados em classes e objetos.
Permitem maior flexibilidade na validação e lógica associada aos atributos, tornando o código mais robusto e organizado. 
*/

public class SetGet {
    // Atributo privado
    private String marca;  

    // Getter para o atributo 'marca'
    public String getMarca() {
        return marca;
    }

    // Setter para o atributo 'marca'
    public void setMarca(String novaMarca) {
        marca = novaMarca;
    }

    public static void main(String[] args) {
        SetGet meuCarro = new SetGet();
        
        // Usando o setter para definir a marca
        meuCarro.setMarca("Toyota");
        
        // Usando o getter para obter a marca
        String marcaDoCarro = meuCarro.getMarca();
        
        System.out.println("Marca do Carro: " + marcaDoCarro);
    }
}

