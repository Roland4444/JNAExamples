import com.sun.jna.{Library, Native, Pointer}
class LoaderSimpleSumm {
  object CLib {
    val INSTANCE: CLib = Native.loadLibrary("simpleSumm", classOf[CLib]).asInstanceOf[CLib]
  }
  trait CLib extends Library{
    def simpleSumm(a: Int, b: Int): Int
  }
  def simpleSummCall(a: Int, b: Int): Int ={
    CLib.INSTANCE.simpleSumm(a, b)
  }
}



class LoaderSummwPointers {
  object CLib {
    val INSTANCE: CLib = Native.loadLibrary("summwPointers", classOf[CLib]).asInstanceOf[CLib]
  }
  trait CLib extends Library{
    def SummwPointers(a: Pointer[Int], b: Pointer[Int]): Int
  }
  def SummwPointersCall(a: Pointer[Int], b: Pointer[Int]): Int ={
    CLib.INSTANCE.SummwPointers(a: Pointer[Int], b: Pointer[Int])
  }
}
