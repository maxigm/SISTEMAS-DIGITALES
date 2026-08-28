module restador_simple (
    input  logic a,
    input  logic b,
    output logic diff,
    output logic bout
);
  logic x;

    assign diff = (a ^ b);
    assign bout = (~a & b);
endmodule
