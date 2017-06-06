import org.apache.spark.SparkConf
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._

object Anagrams{

	val conf = new SparkConf().setMaster("local").setAppName("My App")
	val sc = new SparkContext(conf)
	println("SparkContext ["+sc+"]")
	val usage = " Usage: <String one> <String two>"
	def main(s : Array[String]) : Unit = {
		if(s.length <1){
			println(usage)
			System.exit(0)
		}
		val s1 = s(0)
		val s2 = s(1)

		if(s1.length() != s2.length()){
			println("Strings are NOT Anagrams!")
		}else{
			if(!checkAnagrams(s1,s2))
				println("Strings are NOT Anagrams***********!")
			else
				println("Strings are Anagrams!")
		}
	}


	def checkAnagrams( s1 : String, s2 : String) : Boolean = {
		println("["+s1+"]["+s2+"]")
		for(c <- s1.toCharArray() ){
			if(countChars(s1,c) != countChars(s2,c)){
				return false
			}
		}
		return true
	}


	def countChars( s : String, c : Char) : Int = {
		println("["+s+"]["+c+"]")
		var count = 0
		for(e <- s.toCharArray()){
			if(Character.toUpperCase(e) == Character.toUpperCase(c)){
				count +=1 
			}
		}
		println("["+count+"]")
		return count
	}
}
