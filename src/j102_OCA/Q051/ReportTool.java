package j102_OCA.Q051;

interface Exportable{
	 public abstract void export();
}
interface Exportable2{

}
class Tool implements Exportable{
	//public yerinde protected var normalde
	   public void export() {						// line n1

	    	System.out.println("Tool::export");
	}
}
 class ReportTool extends Tool implements Exportable {
	public void export() {							// line n2

		System.out.println("RTool::export");
	}

//	class ReportTool2 extends ReportTool implements Exportable {
//		public ReportTool2() {
//		}
//
//		public void export() {
//			 System.out.println("RTool2::export");
//		 }
//		 						// line n2
//		 }
	public static  void main(String[] args) {
		Exportable cTool=new Tool();
		Tool aTool = new ReportTool();
		Tool bTool = new Tool();
//		ReportTool dTool=new ReportTool2();
		callExport(aTool);
		callExport(bTool);
		callExport(cTool);
		cTool.export();

	}
	public static void callExport(Exportable ex) {
		ex.export();
	}
}
//What is the result?
//A.	Compilation fails only at line n2.
//B.	RTool::exportTool::export
//C.	Tool::exportTool:export
//D.	Compilation fails only at line n1.
//E.	Compilation fails at both line n1 and line n2.
