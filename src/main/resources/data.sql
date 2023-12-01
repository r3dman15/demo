# INSERT INTO author (author_id, first_name, last_name)
# VALUES (1, 'F. Scott', 'Fitzgerald'),
#        (2, 'J. K', 'Rowling');

# INSERT INTO genre (genre_id, name)
# VALUES (1, 'Fiction'),
#        (2, 'Fantasy'),
#        (3, 'Young Adult'),
#        (4, 'Children'),
#        (5, 'Mystery'),
#        (6, 'Thriller'),
#        (7, 'Romance');

# INSERT INTO book (book_id, title, price, availability, genre_id, description , image_url)
# VALUES (1, 'The Great Gatsby', '19.99', 5, 2, 'tells the tragic story of Jay Gatsby, a self-made millionaire, and his pursuit of Daisy Buchanan, a wealthy young woman whom he loved in his youth' , 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.indiewire.com%2Ffeatures%2Fgeneral%2Fbaz-luhrmann-the-great-gatsby-underrated-leonardo-dicaprio-carey-mulligan-1201799900%2F&psig=AOvVaw25UtM5bw6qzY_boTkEoOSd&ust=1701500800329000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCLCCrcjW7YIDFQAAAAAdAAAAABAE'),
#        (2, 'Harry Potter and the Sorcerer''s Stone', '9.99', 10, 1, 'He wore round glasses held together with a lot of Sellotape because of all the times Dudley had punched him on the nose', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wizardingworld.com%2Ffeatures%2Fharry-potter-book-character-descriptions-versus-how-they-looked-in-the-films&psig=AOvVaw2lh3-837Nt0Z0EUR98yG6n&ust=1701500884313000&source=images&cd=vfe&ved=0CBIQjRxqFwoTCNj08rfX7YIDFQAAAAAdAAAAABAE'),
#        (3, 'Harry Potter and the Chamber of Secrets', '9.99', 0, 1, 'He wore round glasses held together with a lot of Sellotape because of all the times Dudley had punched him on the nose', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wizardingworld.com%2Ffeatures%2Fharry-potter-book-character-descriptions-versus-how-they-looked-in-the-films&psig=AOvVaw2lh3-837Nt0Z0EUR98yG6n&ust=1701500884313000&source=images&cd=vfe&ved=0CBIQjRxqFwoTCNj08rfX7YIDFQAAAAAdAAAAABAE'),
#        (4, 'Harry Potter and the Prisoner of Azkaban', '9.99', 5, 1, 'He wore round glasses held together with a lot of Sellotape because of all the times Dudley had punched him on the nose', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wizardingworld.com%2Ffeatures%2Fharry-potter-book-character-descriptions-versus-how-they-looked-in-the-films&psig=AOvVaw2lh3-837Nt0Z0EUR98yG6n&ust=1701500884313000&source=images&cd=vfe&ved=0CBIQjRxqFwoTCNj08rfX7YIDFQAAAAAdAAAAABAE'),
#        (5, 'Harry Potter and the Goblet of Fire', '9.99', 5, 1, 'He wore round glasses held together with a lot of Sellotape because of all the times Dudley had punched him on the nose', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wizardingworld.com%2Ffeatures%2Fharry-potter-book-character-descriptions-versus-how-they-looked-in-the-films&psig=AOvVaw2lh3-837Nt0Z0EUR98yG6n&ust=1701500884313000&source=images&cd=vfe&ved=0CBIQjRxqFwoTCNj08rfX7YIDFQAAAAAdAAAAABAE'),
#        (6, 'Harry Potter and the Order of the Phoenix', '9.99', 5, 1, 'He wore round glasses held together with a lot of Sellotape because of all the times Dudley had punched him on the nose', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wizardingworld.com%2Ffeatures%2Fharry-potter-book-character-descriptions-versus-how-they-looked-in-the-films&psig=AOvVaw2lh3-837Nt0Z0EUR98yG6n&ust=1701500884313000&source=images&cd=vfe&ved=0CBIQjRxqFwoTCNj08rfX7YIDFQAAAAAdAAAAABAE'),
#        (7, 'Harry Potter and the Half-Blood Prince', '9.99', 5, 1, 'He wore round glasses held together with a lot of Sellotape because of all the times Dudley had punched him on the nose', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wizardingworld.com%2Ffeatures%2Fharry-potter-book-character-descriptions-versus-how-they-looked-in-the-films&psig=AOvVaw2lh3-837Nt0Z0EUR98yG6n&ust=1701500884313000&source=images&cd=vfe&ved=0CBIQjRxqFwoTCNj08rfX7YIDFQAAAAAdAAAAABAE'),
#        (8, 'Harry Potter and the Deathly Hallows', '9.99', 5, 1, 'He wore round glasses held together with a lot of Sellotape because of all the times Dudley had punched him on the nose', 'https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.wizardingworld.com%2Ffeatures%2Fharry-potter-book-character-descriptions-versus-how-they-looked-in-the-films&psig=AOvVaw2lh3-837Nt0Z0EUR98yG6n&ust=1701500884313000&source=images&cd=vfe&ved=0CBIQjRxqFwoTCNj08rfX7YIDFQAAAAAdAAAAABAE');

INSERT INTO book_authors (book_book_id, authors_author_id)
VALUES (1, 1),
       (2, 2),
       (3, 2),
       (4, 2),
       (5, 2),
       (6, 2),
       (7, 2),
       (8, 2);






