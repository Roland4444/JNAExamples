import com.sun.jna.{Library, Memory, Native, Pointer}
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
    def SummwPointers(a: Pointer, b: Pointer): Int
  }
  def SummwPointersCall(a: Pointer, b: Pointer): Int ={
    CLib.INSTANCE.SummwPointers(a: Pointer, b: Pointer)
  }

  def getPointerSc(input: Int): Pointer = {
    val pointer = new Memory(4)
    pointer.setInt(0, input)
    pointer
  }
}

class LoaderWrappedSimpleSumm {
  object CLib {
    val INSTANCE: CLib = Native.loadLibrary("wSimpleSumm", classOf[CLib]).asInstanceOf[CLib]
  }
  trait CLib extends Library{
    def wSimpleSumm(a: Int, b: Int): Int
  }
  def callwSimpleSumm(a: Int, b: Int): Int ={
    CLib.INSTANCE.wSimpleSumm(a: Int, b: Int)
  }

  def getPointerSc(input: Int): Pointer = {
    val pointer = new Memory(4)
    pointer.setInt(0, input)
    pointer
  }
}


class loaderPrintChar {
  object CLib {
    val INSTANCE: CLib = Native.loadLibrary("printChar", classOf[CLib]).asInstanceOf[CLib]
  }
  trait CLib extends Library{
    def printChar(a: Pointer): Int
  }
  def callprintChar(a: Pointer): Int ={
    CLib.INSTANCE.printChar(a)
  }

  def getPointerSc(input: Int): Pointer = {
    val pointer = new Memory(4)
    pointer.setInt(0, input)
    pointer
  }
}


class loaderwPrintChar {
  object CLib {
    val INSTANCE: CLib = Native.loadLibrary("callPrintChar", classOf[CLib]).asInstanceOf[CLib]
  }
  trait CLib extends Library{
    def wprintChar(a: Pointer): Int
  }
  def callwprintChar(a: Pointer): Int ={
    CLib.INSTANCE.wprintChar(a)
  }

  def getPointerSc(input: Int): Pointer = {
    val pointer = new Memory(4)
    pointer.setInt(0, input)
    pointer
  }

  def getPointerStr(input: String): Pointer = {
    val pointer = new Memory(input.length + 1)
    pointer.setString(0, input)
    pointer
  }
}
