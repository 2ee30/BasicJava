package test.mypac;

public class NoteBook {
	// 필드
	private Cpu cpu;
	private Memory memory;
	private HardDisk hardDisk;
	// 생성자
	public NoteBook(Cpu cpu, Memory memory, HardDisk hardDisk) {
		this.cpu=cpu;
		this.memory=memory;
		this.hardDisk=hardDisk;
	}
	
}
