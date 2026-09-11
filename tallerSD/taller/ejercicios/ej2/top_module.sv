module top_module (
    input logic [3:0] a, b,
    output logic [3:0] sum,
    output logic overflow
);
  // COMPLETAR: conectar el sumador provisto (cin=0) con overflow_4b.

  sumador_4b u0 (
    .a   (a),
    .b   (b),
    .cin (1'b0),
    .sum (sum),
    .cout()
  );

  overflow_4b u1 (
    .a       (a),
    .b       (b),
    .sum     (sum),
    .overflow(overflow)
  );

endmodule
