package handler;

import java.io.OutputStream;
import java.io.IOException;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;

import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

public class OrganizationHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String requestMethod = exchange.getRequestMethod().toLowerCase();
        if (requestMethod.equals("get")) {
            getHandler(exchange);
        } else if (requestMethod.equals("post")) {
            postHandler(exchange);
        }
    }

    private void getHandler(HttpExchange exchange) {
        MongoClientURI connectionString = new MongoClientURI("mongodb://example:exampleuser123@ds337985.mlab.com:37985");
        MongoClient mongoClient = new MongoClient(connectionString);
        MongoDatabase database = mongoClient.getDatabase("charing");

        MongoCollection<Document> collection = database.getCollection("organizations");
        OutputStream os = exchange.getResponseBody();
        for (Document cur : collection.find()) {
            os.write(response.getBytes());
        }
        os.close();
    }

    private void postHandler(HttpExchange exchange) {
        return;
    }
}