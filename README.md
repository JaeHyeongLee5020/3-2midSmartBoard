# 💬 jaubbs24 커뮤니티 게시판 프로젝트

**jaubbs24**는 Spring MVC 기반으로 구현된 **커뮤니티 게시판 웹 애플리케이션**입니다.  
사용자는 게시글을 등록하고 목록을 확인할 수 있으며, 실습 중심의 과제로 구조화되어 있습니다.

---

## ✅ 주요 기능

### 1. 게시글 등록
- 제목, 작성자, 내용 입력
- `write.jsp`를 통해 게시글 등록 가능

### 2. 게시글 목록 보기
- 전체 게시글 리스트 출력
- `list.jsp`에서 테이블 형식으로 조회

### 3. MVC 구조 구현
- Controller → DAO → DTO → JSP 뷰의 전형적인 Spring MVC 아키텍처
- 게시글 처리에 필요한 기본 흐름 포함

---

## 🧱 주요 파일 구성

| 파일 / 클래스           | 설명                                  |
|--------------------------|---------------------------------------|
| `BoardDTO.java`          | 게시글 정보를 담는 DTO 클래스         |
| `BoardDAO.java`          | DB 접근 및 데이터 처리 DAO 클래스     |
| `BoardController.java`   | 게시글 등록 및 목록 요청 처리         |
| `write.jsp`              | 게시글 작성 화면                      |
| `list.jsp`               | 게시글 목록 출력 화면                 |
| `applicationContext.xml` | Spring 설정 파일                      |

---

## 🛠️ 사용 기술 스택

| 구성 요소     | 사용 기술                             |
|--------------|----------------------------------------|
| 프레임워크    | Spring MVC                            |
| 언어         | Java, JSP                             |
| 데이터베이스 | Oracle DB                             |
| 프론트엔드   | HTML, JSTL, EL                         |

---

## 📁 실행 방법

1. Oracle DB에 게시판 테이블 생성
2. Eclipse 또는 STS에서 프로젝트 실행
3. `/write.jsp` 접속 후 게시글 등록
4. `/list.jsp`에서 등록된 글 목록 확인

---

## 📌 프로젝트 목적

> Spring MVC 구조를 실습하며 게시글 등록 및 출력 기능을 구현하고,  
> 웹 애플리케이션 개발의 기본 흐름과 DB 연동 과정을 학습하는 데에 목적이 있습니다.

---
