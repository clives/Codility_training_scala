import scala.collection.JavaConversions._

//course: https://codility.com/programmers/lessons/16
//task: https://codility.com/programmers/task/number_solitaire

object Solution {
    
    def solutionStepByStep( A: Array[Int], lastresult: List[Int], n: Int):List[Int]={
        val result= if( n <= 7){
            (1 until n-1)./:( A(0)+A(n-1)){
                (first,second) => 
                    if( A(second) > 0 ) A(second)+first 
                        else first 
            }
        }else{
            A(n-1)+lastresult.take(6).reduceLeft(_ max _)
        }
        result :: lastresult
    }
    
    def solution(A: Array[Int]): Int = {
        ( 1 to A.size).foldLeft(List.empty[Int]){
            (first, second) =>
                solutionStepByStep( A, first, second)
        }.head
    }
}