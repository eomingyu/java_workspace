package koreait.day19;

public interface WordNote {

	//무슨 메소드일까요? 추상메소드, 생략된 키워드는? public abstract
	void wordAdd();
	void wordList();
	void wordSave(String filename);
	void wordRead(String filename);
	
	//디폴트 메소드(인스턴스 메소드)
	default void start() {
		
	}
}
