
package bancos;
import Classe.Cliente;
import java.util.ArrayList;

public class bancoClientes {
    public static ArrayList<Cliente> clientes = new ArrayList();
    
    public static int idCliente = 1;
    
    static {
        
        clientes.add(new Cliente (
                idCliente++,
                "João Silva",
                "123.456.789-00",
                "joazinsilva@gmail.com"
            )
        );
        clientes.add(new Cliente (
                idCliente++,
                "Marquin Soares",
                "123.456.789-01",
                "marquin@gmail.com"
            )
        );
        clientes.add(new Cliente (
                idCliente++,
                "Pedro Tavares",
                "123.456.789-02",
                "pedrintata@gmail.com"
            )
        ); 
        clientes.add(new Cliente(
                idCliente++,
                "Ana Souza",
                "123.456.789-03",
                "ana.souza@gmail.com"
        ));

        clientes.add(new Cliente(
                idCliente++,
                "Carlos Lima",
                "123.456.789-04",
                "carlos.lima@gmail.com"
        ));

        clientes.add(new Cliente(
                idCliente++,
                "Fernanda Costa",
                "123.456.789-05",
                "fernanda.costa@gmail.com"
        ));

        clientes.add(new Cliente(
                idCliente++,
                "Lucas Oliveira",
                "123.456.789-06",
                "lucas.oliveira@gmail.com"
        ));

        clientes.add(new Cliente(
                idCliente++,
                "Mariana Santos",
                "123.456.789-07",
                "mariana.santos@gmail.com"
        ));

        clientes.add(new Cliente(
                idCliente++,
                "Gabriel Pereira",
                "123.456.789-08",
                "gabriel.pereira@gmail.com"
        ));

        clientes.add(new Cliente(
                idCliente++,
                "Juliana Almeida",
                "123.456.789-09",
                "juliana.almeida@gmail.com"
        ));

        clientes.add(new Cliente(
                idCliente++,
                "Rafael Martins",
                "123.456.789-10",
                "rafael.martins@gmail.com"
        ));

        clientes.add(new Cliente(
                idCliente++,
                "Camila Rocha",
                "123.456.789-11",
                "camila.rocha@gmail.com"
        ));

        clientes.add(new Cliente(
                idCliente++,
                "Thiago Ferreira",
                "123.456.789-12",
                "thiago.ferreira@gmail.com"
        ));

        clientes.add(new Cliente(
                idCliente++,
                "Patricia Gomes",
                "123.456.789-13",
                "patricia.gomes@gmail.com"
        ));

        clientes.add(new Cliente(
                idCliente++,
                "Bruno Carvalho",
                "123.456.789-14",
                "bruno.carvalho@gmail.com"
        ));

        clientes.add(new Cliente(
                idCliente++,
                "Renata Mendes",
                "123.456.789-15",
                "renata.mendes@gmail.com"
        ));

        clientes.add(new Cliente(
                idCliente++,
                "Felipe Barbosa",
                "123.456.789-16",
                "felipe.barbosa@gmail.com"
        ));

        clientes.add(new Cliente(
                idCliente++,
                "Vanessa Ribeiro",
                "123.456.789-17",
                "vanessa.ribeiro@gmail.com"
        ));
    }
}
