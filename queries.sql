-- Part 1: Test it with SQL
id, name, employer, skills
-- Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = "St. Louis City";
-- Part 3: Test it with SQL
DROP TABLE job;

-- Part 4: Test it with SQL dunno
SELECT DISTINCT skill.name
FROM job_skills
LEFT JOIN skill ON skill.id=job_skills.skills_id
ORDER BY skill.name;