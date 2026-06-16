package bancos;
import Classe.Produto;
import java.util.ArrayList;


public class bancoProdutos {
    public static ArrayList<Produto> produtos = new ArrayList();
    
    public static int idProduto = 1;
    
    static {
        produtos.add(new Produto(
                idProduto++,
                "Teclado Mecânico RGB",
                249.90,
                15
        ));
        produtos.add(new Produto(
                idProduto++,
                "Mouse Gamer Sem Fio",
                179.50,
                20
        ));
        produtos.add(new Produto(
                idProduto++,
                "Monitor Full HD 24 polegadas",
                899.99,
                8
        ));
        produtos.add(new Produto(
                idProduto++,
                "Headset Bluetooth",
                129.90,
                25
        ));
        produtos.add(new Produto(
                idProduto++,
                "Webcam HD 1080p",
                159.75,
                12
        ));
        produtos.add(new Produto(
                idProduto++,
                "Notebook Intel i5 16GB RAM",
                3499.90,
                6
        ));

        produtos.add(new Produto(
                idProduto++,
                "SSD 1TB NVMe",
                459.90,
                18
        ));

        produtos.add(new Produto(
                idProduto++,
                "Memória RAM 8GB DDR4",
                189.90,
                30
        ));

        produtos.add(new Produto(
                idProduto++,
                "Caixa de Som Bluetooth",
                149.90,
                14
        ));

        produtos.add(new Produto(
                idProduto++,
                "Microfone Condensador USB",
                299.90,
                10
        ));

        produtos.add(new Produto(
                idProduto++,
                "Mouse Pad Gamer XXL",
                79.90,
                22
        ));

        produtos.add(new Produto(
                idProduto++,
                "Impressora Multifuncional",
                699.90,
                7
        ));

        produtos.add(new Produto(
                idProduto++,
                "Cadeira Gamer",
                1199.90,
                5
        ));

        produtos.add(new Produto(
                idProduto++,
                "Hub USB 3.0 4 Portas",
                59.90,
                28
        ));

        produtos.add(new Produto(
                idProduto++,
                "HD Externo 2TB",
                399.90,
                11
        ));

        produtos.add(new Produto(
                idProduto++,
                "Fonte ATX 650W",
                329.90,
                13
        ));

        produtos.add(new Produto(
                idProduto++,
                "Placa de Vídeo RTX 4060",
                2499.90,
                4
        ));

        produtos.add(new Produto(
                idProduto++,
                "Roteador Wi-Fi 6",
                349.90,
                9
        ));

        produtos.add(new Produto(
                idProduto++,
                "Smartwatch",
                499.90,
                16
        ));

        produtos.add(new Produto(
                idProduto++,
                "Tablet 10 Polegadas",
                1299.90,
                8
        ));
}}
