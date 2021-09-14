package padroes.p10.composite.cenario03.folders.model;

import java.util.List;

public class Pasta implements FileSystemItem {
	private String name;
	private List<FileSystemItem> childs;
	
	public Pasta(String name, List<FileSystemItem> childs) {
		this.name = name;
		this.childs = childs;
	}

	@Override
	public void print(String structure) {
		System.out.println(structure + name);
		for(FileSystemItem child: childs) {
			child.print(structure + "| ");
		}
	}

}
