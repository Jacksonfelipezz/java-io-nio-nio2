package br.com.jackson.persistence;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NIO2FilePersistence extends FilePersistence{


    public NIO2FilePersistence(String fileName) throws IOException {
        super(fileName, "/managedFiles/NIO2/");
        var path = Paths.get(currentDir + storedDir);
        if (!Files.exists(path)){
            Files.createDirectories(path);
        }
        clearFile();
    }


    @Override
    public String write(String data) {
        var path = Paths.get(currentDir + storedDir + fileName);
        try {
            Files.write(path, data.getBytes(), StandardOpenOption.CREATE, StandardOpenOption.APPEND);
            Files.write(path, System.lineSeparator().getBytes(), StandardOpenOption.APPEND);
        } catch (IOException ex){
            ex.printStackTrace();
        }
        return data;
    }


    @Override
    public String findAll() {
        var path = Paths.get(currentDir + storedDir + fileName);
        if (!Files.exists(path)) {
            return "";
        }
        try(var lines = Files.lines(path)) {
            return lines.collect(Collectors.joining(System.lineSeparator()));
        } catch (IOException ex){
            ex.printStackTrace();
            return "";
        }
    }

    @Override
    public String findBy(String setence) {
        var content = findAll();
        return Stream.of(content.split(System.lineSeparator()))
                .filter(c -> c.contains(setence))
                .findFirst()
                .orElse("");
    }


}
