package com.test.question.file;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;

//23.08.09
public class Q118_2 {
	public static void main(String[] args) {
		File dir = new File("C:\\class\\code\\java\\파일_디렉토리_문제\\크기 정렬");

		File[] list = dir.listFiles();

		ArrayList<MyFile> dataList = new ArrayList<>();

//		addFile(list, dataList);

		dataList.sort(new Comparator<MyFile>() {
			@Override
			public int compare(MyFile o1, MyFile o2) {
				return (int) (o2.getSize() - o1.getSize());
			}
		});

		print(dataList);
	}

//	private static void addFile(File list, ArrayList<MyFile> dataList) {
//		for (File f : list) {
//			if (f.isFile()) {
//				MyFile file = new MyFile(f.getName(), f.length(), f.getParent());
//				dataList.add(file);
//			}
//			if (f.isDirectory()) {
//				addFile(f, dataList);
//			}
//		}
//	}

	private static void print(ArrayList<MyFile> dataList) {
		System.out.println("[파일명]\t[크기]\t[파일이 들어있는 폴더]");

		for (int i = 0; i < dataList.size(); i++) {
			MyFile curFile = dataList.get(i);
			System.out.println(curFile.getName() + "\t" + getSize(curFile.getSize()) + "\t" + curFile.getParentDir());
		}
	}

	private static String getSize(long length) {
		if (length < 1024) {
			return length + "B";
		} else if (length < 1024 * 1024) {
			return length / 1024 + "KB";
		} else if (length < 1024 * 1024 * 1024) {
			return length / 1024 / 1024 + "MB";
		} else if (length < 1024 * 1024 * 1024 * 1024) {
			return length / 1024 / 1024 / 1024 + "GB";
		} else if (length < 1024 * 1024 * 1024 * 1024 * 1024) {
			return length / 1024 / 1024 / 1024 / 1024 + "TB";
		}

		return null;
	}
}

class MyFile {
	private String name;
	private long size;
	private String parentDir;

	public MyFile(String name, long size, String parentDir) {
		this.name = name;
		this.size = size;
		this.parentDir = parentDir;
	}

	public String getName() {
		return name;
	}

	public long getSize() {
		return size;
	}

	public String getParentDir() {
		return parentDir;
	}

}
