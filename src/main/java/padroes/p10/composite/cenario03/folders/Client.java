package padroes.p10.composite.cenario03.folders;

import padroes.p10.composite.cenario03.folders.model.Arquivo;
import padroes.p10.composite.cenario03.folders.model.FileSystemItem;
import padroes.p10.composite.cenario03.folders.model.Pasta;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

	public static FileSystemItem createCompositeFromFile(File file) {
		if(!file.isDirectory())
			return new Arquivo(file.getName());

		List<FileSystemItem> childs = new ArrayList<>();
		File[] files = file.listFiles();
		for(File javaFile: files) {
			childs.add(createCompositeFromFile(javaFile));
		}

		return new Pasta(file.getName(), childs);
	}
	
	public static void main(String[] args) {
		FileSystemItem file1 = new Arquivo("File1.txt");
		FileSystemItem file2 = new Arquivo("File2.txt");
		FileSystemItem file3 = new Arquivo("File3.txt");
		FileSystemItem file4 = new Arquivo("File4.txt");
		FileSystemItem sf1 = new Pasta("sf1", Arrays.asList(file1));
		FileSystemItem sf2 = new Pasta("sf2", Arrays.asList(file2, sf1));
		FileSystemItem folder = new Pasta("folder", Arrays.asList(sf2, file3, file4));
		
		folder.print("");
		
		System.out.println("------------");
		
		String dir = System.getProperty("user.dir");
		FileSystemItem fromDisk = createCompositeFromFile(new File(dir + File.separator + "src"));
		fromDisk.print(">");
	}
}
