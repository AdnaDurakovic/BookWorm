BEGIN TRANSACTION;
CREATE TABLE "user" (
	`_id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`username`	TEXT NOT NULL UNIQUE,
	`password`	TEXT NOT NULL
);
INSERT INTO `user` VALUES (1,'admin','admin');
CREATE TABLE "library" (
	`user_id`	INTEGER NOT NULL,
	`book_id`	INTEGER NOT NULL,
	`status`	INTEGER NOT NULL,
	FOREIGN KEY(`user_id`) REFERENCES user ( _id ),
	FOREIGN KEY(`book_id`) REFERENCES book ( _id )
);
);
CREATE TABLE "book" (
	`_id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`title`	TEXT NOT NULL,
	`author`	TEXT NOT NULL,
	`isbn`	TEXT NOT NULL UNIQUE,
	`cover_img`	TEXT NOT NULL,
	`release_date`	TEXT NOT NULL,
	`pages`	INTEGER NOT NULL,
	`description`	TEXT NOT NULL
);
INSERT INTO `book` VALUES (1,'The Great Gatsby','F. Scott Fitzgerald','9780743273565','http://upload.wikimedia.org/wikipedia/en/b/b0/Gatsby_1925_jacket.gif','2004-09-30',180,'The Great Gatsby, F. Scott Fitzgerald’s third book, stands as the supreme achievement of his career. This exemplary novel of the Jazz Age has been acclaimed by generations of readers.

The Great Gatsby, F. Scott Fitzgerald’s third book, stands as the supreme achievement of his career. This exemplary novel of the Jazz Age has been acclaimed by generations of readers. The story of the fabulously wealthy Jay Gatsby and his love for the beautiful Daisy Buchanan, of lavish parties on Long Island at a time when The New York Times noted “gin was the national drink and sex the national obsession,” it is an exquisitely crafted tale of America in the 1920s.

The Great Gatsby is one of the great classics of twentieth-century literature.');
CREATE TABLE "android_metadata" ("locale" TEXT DEFAULT 'en_US');
INSERT INTO `android_metadata` VALUES ('en_US');
COMMIT;
