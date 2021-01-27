import com.mongodb.ConnectionString;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.MongoClientSettings;

public class MongoDBConexion {

    private MongoDatabase _database;
    private String _cadenaDeConcexion ="mongodb+srv://admin:admin@cluster0.kq370.mongodb.net/admin?retryWrites=true&w=majority";

    public MongoDBConexion(){
        ConnectionString connString = new ConnectionString(_cadenaDeConcexion);

        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connString)
                .retryWrites(true)
                .build();
        MongoClient mongoClient = MongoClients.create(settings);
        _database = mongoClient.getDatabase("test");
    }

    public void crearColeccion(String nombreDeColeccion){
        _database.createCollection(nombreDeColeccion);
    }

}
