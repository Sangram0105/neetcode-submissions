-- Write your query below
with  highestGrade as(

    select *,dense_rank() over (partition by student_id order by score desc,exam_id) as rnk from exam_results
)

select DISTINCT student_id,exam_id,score from highestGrade where rnk=1;