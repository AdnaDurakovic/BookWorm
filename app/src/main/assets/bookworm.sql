SQLite format 3   @                                                                   -�         
z��88                                                 �j�+tablelibrarylibraryCREATE TABLE `library` (
	`user_id`	INTEGER NOT NULL,
	`book_id`	INTEGER NOT NULL,
	`status`	INTEGER NOT NUL'; indexsqlite_autoindex_book_1book	P++Ytablesqlite_sequencesqlite_sequenceCREATE TABLE sqlite_sequence(name,seq)   ); indexsqlite_autoindex_book_1b   �	�tableuseruserCREATE TABLE "user" (
	`_id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`username`	TEXT NOT NULL UNIQUE,
	`password`	TEXT NOT NULL
)'
; indexsqlite_autoindex_user_1user�l�/tablelibrarylibraryCREATE TABLE "library" (
	`user_id`	INTEGER NOT NULL,
	`book_id`	INTEGER NOT NULL,
	`status`	INTEGER NOT NULL,
	FOREIGN KEY(`user_id`) REFERENCES user ( _id ),
	FOREIGN KEY(`book_id`) REFERENCES book ( _id )
)l--�tableandroid_metadataandroid_metadataCREATE TABLE "android_metadata" ("locale" TEXT DEFAULT 'en_US')   � �                                                                                                                                 �r -3'�!�[The Great GatsbyF. Scott Fitzgerald9780743273565http://upload.wikimedia.org/wikipedia/en/b/b0/Gatsby_1925_jacket.gif2004-09-30 �The Great Gatsby, F. Scott Fitzgerald’s third book, stands as the supreme achievement of his career. This exemplary novel of the Jazz Age has been acclaimed by generations of readers.

The Great Gatsby, F. Scott Fitzgerald’s third book, stands as the supreme achievement of his career. This exemplary novel of the Jazz Age has been acclaimed by generations of readers. The story of the fabulously wealthy Jay Gatsby and his love for the beautiful Daisy Buchanan, of lavish parties on Long Island at a time when The New York Times noted “gin was the national drink and sex the national obsession,” it is an exquisitely crafted tale of America in the 1920s.

The Great Gatsby is one of the great classics of twentieth-cen adminadmin
   � �                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                    '	9780	admin   � ���                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      � *	sqlitebrowser_rename_column_new_table   		book	user   � �                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       aen_US             
   	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  	admin                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     �                                                                                                                                 �r -3'�!�[The Great GatsbyF. Scott Fitzgerald9780743273565http://upload.wikimedia.org/wikipedia/en/b/b0/Gatsby_1925_jacket.gif2004-09-30 �The Great Gatsby, F. Scott Fitzgerald’s third book, stands as the supreme achievement of his career. This exemplary novel of the Jazz Age has been acclaimed by generations of readers.

The Great Gatsby, F. Scott Fitzgerald’s third book, stands as the supreme achievement of his career. This exemplary novel of the Jazz Age has been acclaimed by generations of readers. The story of the fabulously wealthy Jay Gatsby and his love for the beautiful Daisy Buchanan, of lavish parties on Long Island at a time when The New York Times noted “gin was the national drink and sex the national obsession,” it is an exquisitely crafted tale of America in the 1920s.

The Great Gatsby is one of the great classics of twentieth-century literature.
      �                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     '	9780743273565    4  4 �$M<��                              P++Ytablesqlite_sequencesqlite_sequenceCREATE TABLE sqlite_sequence(name,seq)�	�tableuseruserCREATE TABLE "user" (
	`_id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`username`	TEXT NOT NULL UNIQUE,
	`password`	TEXT NOT NULL
)'
; indexsqlite_autoindex_user_1user�l�/tablelibrarylibraryCREATE TABLE "library" (
	`user_id`	INTEGER NOT NULL,
	`book_id`	INTEGER NOT NULL,
	`status`	INTEGER NOT NULL,
	FOREIGN KEY(`user_id`) REFERENCES user ( _id ),
	FOREIGN KEY(`book_id`) REFERENCES book ( _id )
)l--�tableandroid_metadataandroid_metadataCREATE TABLE "android_metadata" ("locale" TEXT DEFAULT 'en_US')�*�7tablebookbookCREATE TABLE `book` (
	`_id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`title`	TEXT NOT NULL,
	`author`	TEXT NOT NULL,
	`isbn`	TEXT NOT NULL UNIQUE,
	`cover_img`	TEXT NOT NULL,
	`release_date`	date NOT NULL,
	`pages`	INTEGER NOT NULL,
	`description`	TEXT NOT NULL
)'; indexsqlite_autoindex_book_1book	�  k��|                                  �7WW�ktablesqlitebrowser_rename_column_new_tablesqlitebrowser_rename_column_new_tableCREATE TABLE `sqlitebrowser_rename_column_new_table` (
	`user_id`	INTEGER NOT NULL,
	`book_id`	INTEGER NOT NULL,
	`status`	INTEGl--�tableandroid_metadataandroid_metadataCREATE TABLE "android_metadata" ("locale" TEXT DEFAULT 'en_US')�l�/tablelibrarylibraryCREATE TABLE "library" (
	`user_id`	INTEGER NOT NULL,
	`book_id`	INTEGER NOT NULL,
	`status`	INTEGER NOT NULL,
	FOREIGN KEY(`user_id`) REFERENCES user ( _id ),
	FOREIGN KEY(`book_id`) REFERENCES book ( _id )
)'; indexsqlite_autoindex_book_1book	� :WW�[tablesqlitebrowser_rename_column_new_tablesq� '
; indexsqlite_autoindex_user_1user�	�tableuseruserCREATE TABLE "user" (
	`_id`	INTEGER NOT NULL PRIMARY KEY AUTOINCREMENT,
	`username`	TEXT NOT NULL UNIQUE,
	`password`	TEXT NOT NULL
)   k}W indexsqlite_autoindex_sqlitebrowser_rename_column_new_table_1sqlitebrowser_rename_column_new_table