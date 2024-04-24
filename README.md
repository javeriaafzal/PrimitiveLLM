# PrimitiveLLM
project structure that generates weights and vectors for a primitive LLM
This is a basic example. You can extend it further by adding functionalities like:

Saving and loading weights/vectors
Different weight initialization techniques
More sophisticated vectorization methods.

# Theory
I heard a dog [bark]

Remember that the attention layer is working with numeric vector representations of the tokens, not the actual text. In a decoder, the process starts with a sequence of token embeddings representing the text to be completed. The first thing that happens is that another positional encoding layer adds a value to each embedding to indicate its position in the sequence:

[1,5,6,2] (I)
[2,9,3,1] (heard)
[3,1,1,2] (a)
[4,10,3,2] (dog)
During training, the goal is to predict the vector for the final token in the sequence based on the preceding tokens. The attention layer assigns a numeric weight to each token in the sequence so far. It uses that value to perform a calculation on the weighted vectors that produces an attention score that can be used to calculate a possible vector for the next token
