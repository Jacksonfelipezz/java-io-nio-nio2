package br.com.jackson.persistence;

import java.io.*;


public class IOFilePersistence extends FilePersistence{


    public IOFilePersistence(final String fileName) throws IOException {
        super(fileName, "/managedFiles/IO/");
        var file = new File(currentDir + storedDir);
        if (!file.exists() && !file.mkdirs()) throw new IOException("Erro ao criar arquivo");

        clearFile();
    }

    @Override
    public String write(String data) {
        try (

                var fileWrite = new FileWriter(currentDir + storedDir + fileName, true);
                var bufferdWrite = new BufferedWriter(fileWrite);
                var printWriter = new PrintWriter(bufferdWrite)

        ){
            printWriter.println(data);

        }catch (IOException ex){
            ex.printStackTrace();
        }
        return data;
    }

    @Override
    public String findAll() {
        var content = new StringBuilder();
        try(var reader = new BufferedReader(new FileReader(currentDir + storedDir + fileName)) ) {
            String line;
            do {
                line = reader.readLine();
                if ((line != null)) content.append(line)
                        .append(System.lineSeparator());
            }while (line != null);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return content.toString();
    }

    @Override
    public String findBy(String setence) {
        var found = "";
        try (var reader = new BufferedReader(new FileReader(currentDir + storedDir + fileName))){
            String line = reader.readLine();
            while (line != null){
                if ((line.contains(setence))){
                    found = line;
                    break;
                }
                line = reader.readLine();
            }

        }catch (IOException ex){
            ex.printStackTrace();
        }
        return found;
    }


}
