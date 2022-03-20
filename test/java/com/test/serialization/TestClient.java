package com.test.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestClient {

	public static void main(String[] args) {
		String filename = "client.ser";

		//serializeObject(filename);
		deserializeObject(filename);
	}

	private static void serializeObject(String filename) {
		Client obj = new Client();
		obj.setId(15);

		try (ObjectOutputStream ops = new ObjectOutputStream(new FileOutputStream(new File(filename)))) {
			ops.writeObject(obj);
			System.out.println("Client object is serialized...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static void deserializeObject(String filename) {
		try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(new File(filename)))) {

			Object obj = inputStream.readObject();
			Client client = (Client) obj;
			System.out.println("Client id : " + client.getId());
			System.out.println("Client name : " + client.getName());

			System.out.println("Client object is Deserialized...");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
