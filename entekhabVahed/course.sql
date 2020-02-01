-- This script only contains the table creation statements and does not fully represent the table in the database. It's still missing: indices, triggers. Do not use it as a backup.

-- Table Definition
CREATE TABLE "public"."course" (
    "id" numeric NOT NULL,
    "lesson" varchar NOT NULL,
    "vahed" numeric NOT NULL,
    PRIMARY KEY ("id")
);

INSERT INTO "public"."course" ("id", "lesson", "vahed") VALUES ('1', 'jv', '3'),
('2', 'Discrete Mathematics', '3'),
('3', 'logic circuit ', '3'),
('4', 'c', '3');
