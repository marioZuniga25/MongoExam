package org.utl.dsm.softcja;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
/**
 * @author nikob
 */
public class ExamenMongo{
    public static void main(String[] args){
        MongoClient client = MongoClients.create("mongodb+srv://Mario:gatitofeliz25@cluster0.3qjw2rl.mongodb.net/test");
        MongoDatabase db = client.getDatabase("RochasDatabase");
        MongoCollection col = db.getCollection("Clientes");
        Document sampleDoc = new Document("_id", "1").append("nombre", "John Smith");
        col.find();
        col.insertOne(sampleDoc);
        
        
        col.updateOne(sampleDoc,sampleDoc);
        
        col.deleteOne(sampleDoc);
        
    }
}