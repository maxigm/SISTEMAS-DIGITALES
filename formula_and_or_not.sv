module formula_and_or_not (
    input  logic x,
    input  logic y,
    input  logic z,
    output logic f
);
  // completar con &, | y ~

  // assign f = (x | y) & (x | ~y) & (x | z);
  assign f = x;

endmodule
