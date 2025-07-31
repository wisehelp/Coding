## 📘 CodingProblem

다양한 온라인 저지(Online Judge)에서 해결한 **코딩 문제**를 기록하는 저장소입니다.  


## 📂 Problem Source

- [Baekjoon Online Judge](https://acmicpc.net)
- [Programmers](https://programmers.co.kr/) <---- 풀긴 했는데 파일정리 귀찮아서 안올림
- [CodeUp](https://codeup.kr/) <---- 자바 있긴 한데 코틀린 없어서 안품
- [SWEA (Samsung SW Expert Academy)](https://swexpertacademy.com/) <---- 회원가입도 안해봄
- [Others...]


## 🛠️ Languages & Development Environment

- **언어**: [Kotlin](https://kotlinlang.org/) & [Java](https://www.java.com/ko/)
- **툴**: [IntelliJ IDEA](https://www.jetbrains.com/)



## 🗂️ Example Folder Structure
```kotlin
baekjoon/
├── Java/
├── Kotlin/
│   ├── 1000_A+B.kt
│   ├── 1001_A-B.kt
│   └── ...
codeup/
├── Java/
├── Kotlin/
│   └── 1_two_sum.kt
programmers/
├── Java/
├── Kotlin/
│   ├── level1/
│   │   └── K번째수.kt
│   └── level2/
│       └── 기능개발.kt
README.md

```

## 🔍 Kotlin Example DFS / BFS
```kotlin
fun dfs(graph: Map<Int, List<Int>>, start: Int, visited: MutableSet<Int> = mutableSetOf()) {
    if (visited.contains(start)) {
        return
    }
    println(start)
    visited.add(start)
    val neighbors = graph[start]
    if (neighbors != null) {
        for (node in neighbors) {
            dfs(graph, node, visited)
        }
    }
}
```
```kotlin
import java.util.LinkedList

fun bfs(graph: Map<Int, List<Int>>, start: Int) {
    val visited = mutableSetOf<Int>()
    val queue = LinkedList<Int>()
    queue.add(start)
    visited.add(start)

    while (queue.isNotEmpty()) {
        val current = queue.removeFirst()
        println(current)

        val neighbors = graph[current]
        if (neighbors != null) {
            for (node in neighbors) {
                if (!visited.contains(node)) {
                    queue.add(node)
                    visited.add(node)
                }
            }
        }
    }
}
```
