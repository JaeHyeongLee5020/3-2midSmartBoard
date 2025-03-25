<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>게시판 글 상세 보기</title>
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" type="text/css" />
<style>
    body {
        background-color: #f8f9fa;
        padding: 20px;
    }
    .wrapper {
        max-width: 800px;
        margin: 0 auto;
        background: #fff;
        padding: 20px;
        border-radius: 10px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    .navBar {
        margin-bottom: 20px;
    }
    .boardTable {
        width: 100%;
        border-collapse: collapse;
    }
    .boardTable th, .boardTable td {
        border: 1px solid #dee2e6;
        padding: 10px;
        text-align: center;
    }
    .boardTable th {
        background-color: #e9ecef;
    }
    .boardTable td.subject a {
        color: #007bff;
        text-decoration: none;
    }
    .boardTable td.subject a:hover {
        text-decoration: underline;
    }
    .writeBt {
        background-color: #007bff;
        color: white;
        border: none;
        padding: 10px 20px;
        border-radius: 5px;
        cursor: pointer;
    }
    .writeBt:hover {
        background-color: #0056b3;
    }
    .deleteBt {
        background-color: #dc3545;
        color: white;
        border: none;
        padding: 10px 20px;
        border-radius: 5px;
        cursor: pointer;
    }
    .deleteBt:hover {
        background-color: #c82333;
    }
</style>
<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script>
    function recommend(bno) {
        $.post("/board/recommend/" + bno, function(data) {
            if (data === "success") {
                alert("추천되었습니다.");
                location.reload();
            } else {
                alert("추천 실패.");
            }
        });
    }

    function deleteArticle(bno) {
        if (confirm("정말 삭제하시겠습니까?")) {
            location.href = "/board/delete/" + bno;
        }
    }
</script>
</head>
<body>
    <div class="wrapper">
        <div class="navBar" align="center">
            <h2>게시판 글 상세 보기</h2>
        </div>
        <table class="table table-bordered">
            <tr>
                <th>글번호</th>
                <td>${board.bno}</td>
            </tr>
            <tr>
                <th>제목</th>
                <td>${board.title}</td>
            </tr>
            <tr>
                <th>작성자</th>
                <td>${board.writerId}</td>
            </tr>
            <tr>
                <th>내용</th>
                <td>${board.content}</td>
            </tr>
            <tr>
                <th>조회수</th>
                <td>${board.viewcnt}</td>
            </tr>
            <tr>
                <th>댓글수</th>
                <td>${board.replycnt}</td>
            </tr>
            <tr>
                <th>추천수</th>
                <td>${board.recommendcnt}</td>
            </tr>
            <tr>
                <th>작성일</th>
                <td>${board.regDate}</td>
            </tr>
        </table>
        <br /><br />
        <div class="text-center">
            <input type="button" value="추천" class="writeBt" onclick="recommend(${board.bno})" />
            <input type="button" value="수정" class="writeBt" onclick="location.href='/board/edit/${board.bno}'" />
            <input type="button" value="삭제" class="deleteBt" onclick="deleteArticle(${board.bno})" />
            <input type="button" value="목록 돌아가기" class="writeBt" onclick="location.href='/board/list'" />
        </div>
    </div>
</body>
</html>
